import { ReactJSXElement } from '@emotion/react/types/jsx-namespace';
import { Flex } from '@chakra-ui/layout';
import { useDisclosure } from '@chakra-ui/hooks';
import React from 'react';
import { Button } from '@chakra-ui/button';
import { Drawer, DrawerBody, DrawerContent, DrawerHeader, DrawerOverlay } from '@chakra-ui/modal';
import { useTheme } from '@/hooks/theme';

const BaseView = (): ReactJSXElement => {
  const {isOpen, onOpen, onClose} = useDisclosure();
  const theme = useTheme();

  return (
    <>
      <Button backgroundColor={theme.secondaryColor}
              color={theme.textColor}
              onClick={onOpen}>
        Open
      </Button>
      <Drawer placement="top"
              onClose={onClose}
              isOpen={isOpen}>
        <DrawerOverlay/>
        <DrawerContent backgroundColor={theme.primaryColor}
                       color={theme.textColor}>
          <DrawerHeader borderBottomWidth="1px">Dashboardio</DrawerHeader>
          <DrawerBody>
            <p>sth</p>
            <p>sth</p>
            <p>sth</p>
          </DrawerBody>
        </DrawerContent>
      </Drawer>
    </>
  );
};

export const Sidebar = (): ReactJSXElement => {
  const theme = useTheme();

  return (
    <>
      <Flex backgroundColor={theme.primaryColor}
            color={theme.textColor}>
        <BaseView/>
      </Flex>
    </>
  );
};
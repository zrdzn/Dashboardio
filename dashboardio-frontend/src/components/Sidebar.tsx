import { ReactJSXElement } from '@emotion/react/types/jsx-namespace';
import { Flex } from '@chakra-ui/layout';
import { useDisclosure } from '@chakra-ui/hooks';
import React from 'react';
import { Button } from '@chakra-ui/button';
import { Drawer, DrawerBody, DrawerContent, DrawerHeader, DrawerOverlay } from '@chakra-ui/modal';
import { useTheme } from '@/hooks/theme';
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faBars, faBolt, faGears, faHouse, faX} from "@fortawesome/free-solid-svg-icons";

const SidebarLogo = (): ReactJSXElement => {
    return (
        <Flex textTransform={'uppercase'}
              fontWeight={'semibold'}
              letterSpacing={'wider'}
              fontSize={'xl'}
              textAlign={'center'}>
            Dashboardio
        </Flex>
    )
}

const BaseView = (): ReactJSXElement => {
  const {isOpen, onOpen, onClose} = useDisclosure();
  const theme = useTheme();

  return (
    <>
      <Flex justifyContent={'space-between'}
            alignItems={'center'}
            width={'full'}>
        <Flex padding={4}>
          <SidebarLogo />
        </Flex>
        <Flex padding={2}>
          <Button backgroundColor={theme.primaryColor}
                  padding={3}
                  variant={'unstyled'}
                  onClick={onOpen}>
            <FontAwesomeIcon icon={faBars} />
          </Button>
        </Flex>
      </Flex>

      <Drawer placement="top"
              onClose={onClose}
              isOpen={isOpen}>
        <DrawerOverlay/>
        <DrawerContent backgroundColor={theme.secondaryColor}
                       color={theme.textColor}>
            <DrawerHeader backgroundColor={theme.primaryColor}>
                <Flex justifyContent={'space-between'}
                      alignItems={'center'}>
                    <Flex />
                    <Flex>
                        <SidebarLogo />
                    </Flex>
                    <Flex>
                        <Button backgroundColor={theme.primaryColor}
                                onClick={onClose}>
                            <FontAwesomeIcon icon={faX} />
                        </Button>
                    </Flex>
                </Flex>
            </DrawerHeader>
          <DrawerBody>
              <Flex direction={'column'}>
                  <Flex marginY={2}>
                      <Button backgroundColor={theme.primaryColor}
                              onClick={onClose}
                              width={'full'}>
                          <Flex columnGap={1}>
                            <Flex>
                              <FontAwesomeIcon width={'18'}
                                               icon={faHouse} />
                            </Flex>
                            <Flex>
                              General
                            </Flex>
                          </Flex>
                      </Button>
                  </Flex>
                  <Flex marginY={2}>
                    <Button backgroundColor={theme.primaryColor}
                            onClick={onClose}
                            width={'full'}>
                      <Flex columnGap={1}>
                        <Flex>
                          <FontAwesomeIcon width={'18'}
                                           icon={faBolt} />
                        </Flex>
                        <Flex>
                          Electricity
                        </Flex>
                      </Flex>
                    </Button>
                  </Flex>
                  <Flex marginY={2}>
                    <Button backgroundColor={theme.primaryColor}
                            onClick={onClose}
                            width={'full'}>
                      <Flex columnGap={1}>
                        <Flex>
                          <FontAwesomeIcon width={'18'}
                                           icon={faGears} />
                        </Flex>
                        <Flex>
                          Production
                        </Flex>
                      </Flex>
                    </Button>
                  </Flex>
              </Flex>
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
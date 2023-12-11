import { ReactJSXElement } from '@emotion/react/types/jsx-namespace';
import { Flex } from '@chakra-ui/layout';
import { useDisclosure } from '@chakra-ui/hooks';
import React from 'react';
import { Button } from '@chakra-ui/button';
import { Drawer, DrawerBody, DrawerContent, DrawerHeader, DrawerOverlay } from '@chakra-ui/modal';
import { useTheme } from '@/hooks/theme';
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faBars, faBolt, faGears, faHouse, faX} from "@fortawesome/free-solid-svg-icons";
import Link from "next/link";
import {useRouter} from "next/router";

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
  const router = useRouter();

  const serverPublicId = router.query.serverPublicId

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

      <Drawer placement={'left'}
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
                              padding={3.5}
                              variant={'unstyled'}
                              onClick={onClose}>
                        <FontAwesomeIcon icon={faX} />
                      </Button>
                    </Flex>
                </Flex>
            </DrawerHeader>
          <DrawerBody>
              <Flex direction={'column'}
                    gap={3}
                    alignItems={'center'}>
                  <Flex width={'3xs'}>
                    <Link href={`/server/${serverPublicId}/general`}
                          style={{width: "inherit"}}>
                      <Button backgroundColor={theme.primaryColor}
                              onClick={onClose}
                              width={'full'}>
                          <Flex columnGap={2}>
                            <Flex>
                              <FontAwesomeIcon width={16}
                                               icon={faHouse} />
                            </Flex>
                            <Flex>
                              General
                            </Flex>
                          </Flex>
                      </Button>
                    </Link>
                  </Flex>
                  <Flex width={'3xs'}>
                    <Link href={`/server/${serverPublicId}/electricity`}
                          style={{width: "inherit"}}>
                      <Button backgroundColor={theme.primaryColor}
                              onClick={onClose}
                              width={'full'}>
                          <Flex columnGap={2}>
                            <Flex>
                              <FontAwesomeIcon width={16}
                                               icon={faBolt} />
                            </Flex>
                            <Flex>
                              Electricity
                            </Flex>
                          </Flex>
                      </Button>
                    </Link>
                  </Flex>
                  <Flex width={'3xs'}>
                    <Link href={`/server/${serverPublicId}/production`}
                          style={{width: "inherit"}}>
                      <Button backgroundColor={theme.primaryColor}
                              onClick={onClose}
                              width={'full'}>
                        <Flex columnGap={2}>
                          <Flex>
                            <FontAwesomeIcon width={16}
                                             icon={faGears} />
                          </Flex>
                          <Flex>
                            Production
                          </Flex>
                        </Flex>
                      </Button>
                    </Link>
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